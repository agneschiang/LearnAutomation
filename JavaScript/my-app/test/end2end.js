import { Selector } from "testcafe";

const origin = "http://automationpractice.com/index.php";
const website = "https://github.com";

fixture `End to End application`
    .page `${website}`;

test('Find "testcafe-example" repo on Github', async t => {
    const repo = Selector('.repo-list > li > div');
    await t 
        .typeText('form[action="/search"]', 'testcafe-example user:mjhea0')
        .pressKey('enter');
    //check li for results 
    await t 
        .expect(repo.innerText).contains('mjhea0/testcafe-example');

});