$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("storelocator.feature");
formatter.feature({
  "line": 2,
  "name": "Store Locator",
  "description": "",
  "id": "store-locator",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@storelocator"
    }
  ]
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Verify functionality of store locator with valid  postcode and town",
  "description": "",
  "id": "store-locator;verify-functionality-of-store-locator-with-valid--postcode-and-town",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "I am on Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I click TU store locator link",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "enter the \"\u003cpostcodeAndTown\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "it should display the nearest stores",
  "keyword": "Then "
});
formatter.examples({
  "line": 8,
  "name": "",
  "description": "",
  "id": "store-locator;verify-functionality-of-store-locator-with-valid--postcode-and-town;",
  "rows": [
    {
      "cells": [
        "postcodeAndTown"
      ],
      "line": 9,
      "id": "store-locator;verify-functionality-of-store-locator-with-valid--postcode-and-town;;1"
    },
    {
      "cells": [
        "IG7 5NP"
      ],
      "line": 10,
      "id": "store-locator;verify-functionality-of-store-locator-with-valid--postcode-and-town;;2"
    },
    {
      "cells": [
        "London"
      ],
      "line": 11,
      "id": "store-locator;verify-functionality-of-store-locator-with-valid--postcode-and-town;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 13516302900,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Verify functionality of store locator with valid  postcode and town",
  "description": "",
  "id": "store-locator;verify-functionality-of-store-locator-with-valid--postcode-and-town;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@storelocator"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "I am on Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I click TU store locator link",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "enter the \"IG7 5NP\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "it should display the nearest stores",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageStepDef.i_am_on_Home_page()"
});
formatter.result({
  "duration": 350813200,
  "status": "passed"
});
formatter.match({
  "location": "StoreLocator.i_click_TU_store_locator_link()"
});
formatter.result({
  "duration": 3461992300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "IG7 5NP",
      "offset": 11
    }
  ],
  "location": "StoreLocator.enter_the(String)"
});
formatter.result({
  "duration": 2767574000,
  "status": "passed"
});
formatter.match({
  "location": "ResultPageStepDef.it_should_display_the_nearest_stores()"
});
formatter.result({
  "duration": 105423100,
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[IG7 5NP]\u003e but was:\u003c[Store locator search results: IG7 5NP | Tu clothing]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat org.junit.Assert.assertEquals(Assert.java:144)\r\n\tat com.runner.ResultsPage.storeLocatorWithValidResults(ResultsPage.java:30)\r\n\tat StepDefinition.ResultPageStepDef.it_should_display_the_nearest_stores(ResultPageStepDef.java:38)\r\n\tat ✽.Then it should display the nearest stores(storelocator.feature:7)\r\n",
  "status": "failed"
});
formatter.before({
  "duration": 12543606000,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Verify functionality of store locator with valid  postcode and town",
  "description": "",
  "id": "store-locator;verify-functionality-of-store-locator-with-valid--postcode-and-town;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@storelocator"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "I am on Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I click TU store locator link",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "enter the \"London\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "it should display the nearest stores",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageStepDef.i_am_on_Home_page()"
});
formatter.result({
  "duration": 8456100,
  "status": "passed"
});
formatter.match({
  "location": "StoreLocator.i_click_TU_store_locator_link()"
});
formatter.result({
  "duration": 3375005800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "London",
      "offset": 11
    }
  ],
  "location": "StoreLocator.enter_the(String)"
});
formatter.result({
  "duration": 2746202300,
  "status": "passed"
});
formatter.match({
  "location": "ResultPageStepDef.it_should_display_the_nearest_stores()"
});
formatter.result({
  "duration": 63433700,
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[London]\u003e but was:\u003c[Store locator search results: London | Tu clothing]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat org.junit.Assert.assertEquals(Assert.java:144)\r\n\tat com.runner.ResultsPage.storeLocatorWithValidResults(ResultsPage.java:30)\r\n\tat StepDefinition.ResultPageStepDef.it_should_display_the_nearest_stores(ResultPageStepDef.java:38)\r\n\tat ✽.Then it should display the nearest stores(storelocator.feature:7)\r\n",
  "status": "failed"
});
formatter.scenarioOutline({
  "line": 15,
  "name": "Verify functionality of store locator with invalid postcode and town",
  "description": "",
  "id": "store-locator;verify-functionality-of-store-locator-with-invalid-postcode-and-town",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 16,
  "name": "I am on Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "I click TU store locator link",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "enter \"\u003cinvalidpostcodeAndTown\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "it should display warning message",
  "keyword": "Then "
});
formatter.examples({
  "line": 20,
  "name": "",
  "description": "",
  "id": "store-locator;verify-functionality-of-store-locator-with-invalid-postcode-and-town;",
  "rows": [
    {
      "cells": [
        "invalidpostcodeAndTown"
      ],
      "line": 21,
      "id": "store-locator;verify-functionality-of-store-locator-with-invalid-postcode-and-town;;1"
    },
    {
      "cells": [
        "AND DEF"
      ],
      "line": 22,
      "id": "store-locator;verify-functionality-of-store-locator-with-invalid-postcode-and-town;;2"
    },
    {
      "cells": [
        "NonLondon"
      ],
      "line": 23,
      "id": "store-locator;verify-functionality-of-store-locator-with-invalid-postcode-and-town;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 13030145300,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "Verify functionality of store locator with invalid postcode and town",
  "description": "",
  "id": "store-locator;verify-functionality-of-store-locator-with-invalid-postcode-and-town;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@storelocator"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "I am on Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "I click TU store locator link",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "enter \"AND DEF\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "it should display warning message",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageStepDef.i_am_on_Home_page()"
});
formatter.result({
  "duration": 22404800,
  "status": "passed"
});
formatter.match({
  "location": "StoreLocator.i_click_TU_store_locator_link()"
});
formatter.result({
  "duration": 3394342000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "AND DEF",
      "offset": 7
    }
  ],
  "location": "StoreLocator.enter(String)"
});
formatter.result({
  "duration": 5374022500,
  "error_message": "org.junit.ComparisonFailure: expected:\u003cStore locator [- find a store near you] | Tu clothing\u003e but was:\u003cStore locator [search results: AND DEF] | Tu clothing\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat org.junit.Assert.assertEquals(Assert.java:144)\r\n\tat com.runner.StoreLocator.storeLocatorWithInvalidDetails(StoreLocator.java:34)\r\n\tat StepDefinition.StoreLocator.enter(StoreLocator.java:26)\r\n\tat ✽.And enter \"AND DEF\"(storelocator.feature:18)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "ResultPageStepDef.it_should_display_warning_message()"
});
formatter.result({
  "status": "skipped"
});
formatter.before({
  "duration": 12778429100,
  "status": "passed"
});
formatter.scenario({
  "line": 23,
  "name": "Verify functionality of store locator with invalid postcode and town",
  "description": "",
  "id": "store-locator;verify-functionality-of-store-locator-with-invalid-postcode-and-town;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@storelocator"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "I am on Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "I click TU store locator link",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "enter \"NonLondon\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "it should display warning message",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageStepDef.i_am_on_Home_page()"
});
formatter.result({
  "duration": 9585400,
  "status": "passed"
});
formatter.match({
  "location": "StoreLocator.i_click_TU_store_locator_link()"
});
formatter.result({
  "duration": 3489736100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "NonLondon",
      "offset": 7
    }
  ],
  "location": "StoreLocator.enter(String)"
});
formatter.result({
  "duration": 6125512100,
  "error_message": "org.junit.ComparisonFailure: expected:\u003cStore locator [- find a store near you] | Tu clothing\u003e but was:\u003cStore locator [search results: NonLondon] | Tu clothing\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat org.junit.Assert.assertEquals(Assert.java:144)\r\n\tat com.runner.StoreLocator.storeLocatorWithInvalidDetails(StoreLocator.java:34)\r\n\tat StepDefinition.StoreLocator.enter(StoreLocator.java:26)\r\n\tat ✽.And enter \"NonLondon\"(storelocator.feature:18)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "ResultPageStepDef.it_should_display_warning_message()"
});
formatter.result({
  "status": "skipped"
});
formatter.before({
  "duration": 12933258900,
  "status": "passed"
});
formatter.scenario({
  "line": 26,
  "name": "Verify functionality of store locator for click and collect",
  "description": "",
  "id": "store-locator;verify-functionality-of-store-locator-for-click-and-collect",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 27,
  "name": "I am on Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 28,
  "name": "I click TU store locator Link",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "enter post code \"IG7 5NP\"",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "select click and collect",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "it should display nearest stores with click and collect options",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageStepDef.i_am_on_Home_page()"
});
formatter.result({
  "duration": 10879200,
  "status": "passed"
});
formatter.match({
  "location": "StoreLocator.i_click_TU_store_locator_Link()"
});
formatter.result({
  "duration": 3714180700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "IG7 5NP",
      "offset": 17
    }
  ],
  "location": "StoreLocator.enter_post_code(String)"
});
formatter.result({
  "duration": 376287000,
  "status": "passed"
});
formatter.match({
  "location": "StoreLocator.select_click_and_collect()"
});
formatter.result({
  "duration": 2114097000,
  "status": "passed"
});
formatter.match({
  "location": "ResultPageStepDef.it_should_display_nearest_stores_with_click_and_collect_options()"
});
formatter.result({
  "duration": 145353100,
  "status": "passed"
});
formatter.before({
  "duration": 14267353800,
  "status": "passed"
});
formatter.scenario({
  "line": 34,
  "name": "Verify functionality of store locator that stock clothing",
  "description": "",
  "id": "store-locator;verify-functionality-of-store-locator-that-stock-clothing",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 35,
  "name": "I am on Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 36,
  "name": "I click Tu store locator link",
  "keyword": "When "
});
formatter.step({
  "line": 37,
  "name": "enter post code \"IG2 6BX\"",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "select checkbox for only show stores that stock clothing and tick checkbox womens",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "it should display store that stock clothing",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageStepDef.i_am_on_Home_page()"
});
formatter.result({
  "duration": 11486000,
  "status": "passed"
});
formatter.match({
  "location": "StoreLocator.i_click_Tu_store_locator_link()"
});
formatter.result({
  "duration": 3493403000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "IG2 6BX",
      "offset": 17
    }
  ],
  "location": "StoreLocator.enter_post_code(String)"
});
formatter.result({
  "duration": 311641600,
  "status": "passed"
});
formatter.match({
  "location": "StoreLocator.select_checkbox_for_only_show_stores_that_stock_clothing_and_tick_checkbox_womens()"
});
formatter.result({
  "duration": 49400,
  "status": "passed"
});
formatter.match({
  "location": "ResultPageStepDef.it_should_display_store_that_stock_clothing()"
});
formatter.result({
  "duration": 7987200,
  "error_message": "org.junit.ComparisonFailure: expected:\u003cStore locator [search results: IG7 5NP] | Tu clothing\u003e but was:\u003cStore locator [- find a store near you] | Tu clothing\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat org.junit.Assert.assertEquals(Assert.java:144)\r\n\tat com.runner.ResultsPage.storeThatStockClothes(ResultsPage.java:42)\r\n\tat StepDefinition.ResultPageStepDef.it_should_display_store_that_stock_clothing(ResultPageStepDef.java:53)\r\n\tat ✽.Then it should display store that stock clothing(storelocator.feature:39)\r\n",
  "status": "failed"
});
});