package suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import clases.OtraPrueba;
import clases.Pruebas;

@RunWith(Suite.class)
@SuiteClasses({ Pruebas.class, OtraPrueba.class })

public class AllTests {

}
