package tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ 
	AddNewProductTest.class,
	AddEmptyProductTest.class,
	EditProductTest.class,
	AddNewStateTest.class,
	AddEmptyStateTest.class,
	AddNewProductWithTaxTest.class,
	AddNewProductWithTax10Test.class,
	AddNewFeaturesTest.class,
	AddEmptyFeatureTest.class,
	AddNewAttributeTest.class,
	AddEmptyAttributeTest.class,
	AddNewAddressTest.class,
	AddEmptyAddressTest.class,
	AddNewCategoryTest.class,
	AddEmptyCategoryTest.class,
	EditCategoryTest.class,
	AddNewManufacturerTest.class,
	AddEmptyManufacturerTest.class,
	EditManufacturerTest.class,
	AddNewSupplierTest.class,
	AddEmptySupplierTest.class,
	RemoveSupplierTest.class,
	RegisterEmployeeTest.class,
	RegisterEmployee_NoNameTest.class,
	RegisterEmployee_NoEmailTest.class,
	RegisterEmployee_NoPasswordTest.class,
	OutOfStockValidityTest.class,
	AddTagTest.class,
	AddEmptyTagTest.class,
	AddCurrencyTest.class,
	AddEmptyCurrencyTest.class,
	EditAddressTest.class,
	EditEmployeeTest.class,
})
public class TestSuite {}
