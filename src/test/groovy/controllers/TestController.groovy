package controllers

import io.vertx.groovy.ext.web.RoutingContext

public class TestController {

	def someMethod(RoutingContext context) {
		context.response().end("Test GET")
	}
}
