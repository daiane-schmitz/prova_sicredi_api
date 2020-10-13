package br.com.cwi.runners;

import br.com.cwi.tests.base.tests.BaseTest;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Categories.IncludeCategory(br.com.cwi.suites.AllTests.class)
@Suite.SuiteClasses({
        BaseTest.class,
})
public class AllTests {
}
