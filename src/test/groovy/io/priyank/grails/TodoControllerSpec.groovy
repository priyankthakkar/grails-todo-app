package io.priyank.grails

import grails.plugin.json.view.mvc.JsonViewResolver
import grails.test.hibernate.HibernateSpec
import grails.testing.web.controllers.ControllerUnitTest

@SuppressWarnings('MethodName')
class TodoControllerSpec extends HibernateSpec implements ControllerUnitTest<TodoController> {

    static doWithSpring = {
        jsonSmartViewResolver(JsonViewResolver)
    }

    def setup() {
        Todo.saveAll(
                new Todo(title: 'A Sample Todo One', description: 'A valid description for a sample todo one.', done: false),
                new Todo(title: 'A Sample Todo Two', description: 'A valid description for a sample todo two.', done: false),
                new Todo(title: 'A Sample Todo Three', description: 'A valid description for a sample todo three.', done: false),
                new Todo(title: 'A Sample Todo Four', description: 'A valid description for a sample todo four.', done: false),
                new Todo(title: 'A Sample Todo Five', description: 'A valid description for a sample todo five.', done: false)
        )
    }

    def cleanup() {
    }

    void "test the search action find results"() {
        when: 'A query is executed that finds results'
        controller.search('sample')

        then: 'The response is correct'
        response.json.size() == 5
    }
}