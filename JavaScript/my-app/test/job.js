import { Selector } from 'testcafe';

// selectors
const title = Selector('h1');
const tableRows = Selector('tbody > tr');
const addJobButton = Selector('a.btn.btn-primary');
const firstJob = Selector('tbody > tr').withText('Horse Whisperer');

fixture('Node Jobs')
  .page('http://localhost:3000');

test('All Jobs', async (t) => {
  // check title, add job button, table rows, and job exists
  await t
    .expect(title.innerText).eql('All Jobs')
    .expect(addJobButton.innerText).eql('Add New Job')
    .expect(tableRows.count).eql(3)
    .expect(firstJob.exists).ok();
});