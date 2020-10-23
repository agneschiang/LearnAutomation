// The proxyRequest and proxyResponse functions will be called for all requests  and responses made via ZAP, 
// excluding some of the automated tools
// If they return 'false' then the corresponding request / response will be dropped. 
// You can use msg.setForceIntercept(true) in either method to force a breakpoint
// Note that new proxy scripts will initially be disabled
// Right click the script in the Scripts tree and select "enable"  
/**
 * This function allows interaction with proxy requests (i.e.: outbound from the browser/client to the server).
 * 
 * @param msg - the HTTP request being proxied. This is an HttpMessage object.
 */
function proxyRequest(msg) {
    return true;
}
/**
 * This function allows interaction with proxy responses (i.e.: inbound from the server to the browser/client).
 * 
 * @param msg - the HTTP response being proxied. This is an HttpMessage object.
 */
function proxyResponse(msg) {
    if(msg.getRequestHeader().getURI().toString().indexOf('voucher-settings')<0){
        return true;
    }
    
    print('Faking 500 response for url ' + msg.getRequestHeader().getURI().toString())
    var fakeResponse = JSON.stringify({
	//put the response body here
        "something":true
    });
    msg.setResponseBody(fakeResponse);
    var status_to_change = "200 OK";
    var status_to_replace = "200 OK";
    var fakeHeader = msg.getResponseHeader().toString().replaceAll(status_to_change, status_to_replace);
    msg.setResponseHeader(fakeHeader);
    msg.getResponseHeader().setContentLength(msg.getResponseBody().length());
    print('[Faking response header] ' + msg.getResponseHeader().toString());
    print('[Faking response body] ' + msg.getResponseBody().toString());
    return true;
}