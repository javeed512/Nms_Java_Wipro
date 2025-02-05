package com.wipro.suite;

import org.junit.platform.suite.api.ExcludeTags;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

import com.wipro.testing.AdditionTest;
import com.wipro.testing.SubstractionTest;

@Suite
//@SelectClasses({AdditionTest.class,SubstractionTest.class})
@SelectPackages("com.wipro.testing")
//@IncludeTags(value = {"add","sub"})
//@ExcludeTags(value="production")

@IncludeTags(value = {"production"})
public class CalculatorTestSuite {

}
