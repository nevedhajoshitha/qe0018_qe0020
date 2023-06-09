package StepDef;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
@After
public void Enter() {
	System.out.println("Program ended");
}

@Before
public void Exit() {
	System.out.println("Program started");
}
}
