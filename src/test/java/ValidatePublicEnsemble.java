import com.javafxensemble.website.test.ValidateEnsemble;

public class ValidatePublicEnsemble extends ValidateEnsemble {

    public ValidatePublicEnsemble() {
        skippedClasses().add("com.dlsc.gemsfx.demo.PaymentOptionTilesApp");
    }

}
