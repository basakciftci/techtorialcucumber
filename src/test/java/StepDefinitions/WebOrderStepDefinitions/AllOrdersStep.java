package StepDefinitions.WebOrderStepDefinitions;

        import Pages.WebOrdersPage.AllOrdersPage;
        import io.cucumber.java.en.Then;
        import org.junit.Assert;

public class AllOrdersStep {
    AllOrdersPage page = new AllOrdersPage();

    @Then("the user validate the header text {string}")
    public void the_user_validate_the_header_text(String expected) {
        String actual=page.ordersHeader.getText().trim();
        Assert.assertTrue(actual.equals(expected.trim()));
    }
}