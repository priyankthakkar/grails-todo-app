package io.priyank.grails

import grails.test.hibernate.HibernateSpec

class TodoSpec extends HibernateSpec {

    def setup() {
    }

    def cleanup() {
    }

    void "test Todo class validation"() {
        when: 'A domain class is saved with invalid data'
        Todo todo = new Todo(title: 'Sample', description: '', done: false)
        todo.save()

        then: 'There were errors and the data was not saved'
        todo.hasErrors()
        todo.errors.getFieldError('title')
        todo.errors.getFieldError('description')
        Todo.count() == 0
    }

    void "test save for a vaild Todo instance"() {
        when: 'A domain class is supplied valid set of data'
        Todo todo = new Todo(title: 'A sample title for Todo', description: 'A valid sample description for a single todo.', done: false)
        todo.save()

        then: 'The todo was saved successfully'
        Todo.count() == 1
        Todo.first().title == 'A sample title for Todo'
    }
}
