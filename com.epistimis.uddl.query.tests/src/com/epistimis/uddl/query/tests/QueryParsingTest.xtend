/*
 * generated by Xtext 2.32.0
 */
/*
 * Copyright (c) 2022, 2023 Epistimis LLC (http://www.epistimis.com).
 */
package com.epistimis.uddl.query.tests

import com.epistimis.uddl.query.query.QuerySpecification
import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith

/**
 * TODO: There is a weird parsing bug here. Change any field name to '.desc' and it will cause that test to fail.
 * Is that because it is interpreting that as an escape?
 */
@ExtendWith(InjectionExtension)
@InjectWith(QueryInjectorProvider)
class QueryParsingTest {
	@Inject
	ParseHelper<QuerySpecification> parseHelper
	
	@Test
	def void testBasicSelect() {
		val result = parseHelper.parse('''select * from X''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
	}
	
	/**
	 * This test fails consistently when 'x.desd' or 'x.description' is converted to 'x.desc'.
	 * Is it a problem with encoding? or with the '.desc' being parsed as escape??
	 */
	@Test
	def void testRIG_EquivalentEntity_Query1() {
		val result = parseHelper.parse('''select x.id, x.description from X as x''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
	}
	@Test
	def void testRIG_EquivalentEntity_Query2() {
		val result = parseHelper.parse('''select p.mass, p.vol from P as p''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
	}

	@Test
	def void testRIG_AircraftAirportArrival_PDM_Query1() {
		val result = parseHelper.parse('''
			select Airport.ID, Airport.code, Gate.ID, Gate.capacity from Airport join Gate on Airport.gates;
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
	}

	@Test
	def void testRIG_ModeledDomainConcepts_PDM_Query1() {
		val result = parseHelper.parse('''
			select position, extents as size from Area as aoi
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
	}

	@Test
	def void testRIG_DogOwnership_CDM_Query1() {
		val result = parseHelper.parse('''
			select name from Dog
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
	}

	@Test
	def void testRIG_DogOwnership_CDM_Query2() {
		val result = parseHelper.parse('''
			select Person.*, Dog.* from Person join DogOwnership on DogOwnership.owner = Person join Dog on DogOwnership.dog = Dog
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
	}

	@Test
	def void testRIG_DogOwnership_CDM_Query3() {
		val result = parseHelper.parse('''
			SELECT Person.*, Dog.name, Dog.age, DogOwnership.* FROM Person JOIN DogOwnership on DogOwnership.owner = Person JOIN Dog on DogOwnership.dog = Dog
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
	}

}
