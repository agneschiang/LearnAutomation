using System;
using System.Collections.Generic;
using System.IO;
using System.Net;
using System.Text;

namespace APIUnitTest.Helpers
{
    class GetAPI
    {
        //This is example on how to do a GET request
        public string Getmethod()
        {
            //Change the url
            const string url = "http://api.geonames.org/weatherJSON?north=44.1&south=-9.9&east=-22.4&west=55.2&username=demo";
            HttpWebRequest request = (HttpWebRequest)WebRequest.Create(url);
            request.Method = "GET";

            var webResponse = request.GetResponse();
            var webStream = webResponse.GetResponseStream();
            var responseReader = new StreamReader(webStream);
            var response = responseReader.ReadToEnd();
            
            return response;
        }
    }
}
