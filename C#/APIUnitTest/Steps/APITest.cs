using System;
using System.Collections.Generic;
using System.Text;
using TechTalk.SpecFlow;

namespace APIUnitTest.Steps
{
    [Binding]
    class APITest
    {
        [Given(@"I have my API ready")]
        public void GivenIHaveMyAPIReady()
        {
            //ScenarioContext.Current.Pending();
        }

        [Given(@"I have entered '(.*)' for the first one")]
        public void GivenIHaveEnteredForTheFirstOne(string p0)
        {
            //ScenarioContext.Current.Pending();
        }

        [Given(@"I have entered '(.*)' for the second one")]
        public void GivenIHaveEnteredForTheSecondOne(int p0)
        {
            //ScenarioContext.Current.Pending();
        }

        [Given(@"I have entered '(.*)' for the third one")]
        public void GivenIHaveEnteredForTheThirdOne(string p0)
        {
            //ScenarioContext.Current.Pending();
        }

        [Given(@"I have entered '(.*)' for the fouth one")]
        public void GivenIHaveEnteredForTheFouthOne(string p0)
        {
            //ScenarioContext.Current.Pending();
        }

        [When(@"I press add")]
        public void WhenIPressAdd()
        {
            //ScenarioContext.Current.Pending();
        }

        [Then(@"the result should be '(.*)' on the screen")]
        public void ThenTheResultShouldBeOnTheScreen(Decimal p0)
        {
            //ScenarioContext.Current.Pending();
        }




    }
}
