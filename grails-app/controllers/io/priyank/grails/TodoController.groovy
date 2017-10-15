package io.priyank.grails

import grails.rest.RestfulController

class TodoController extends RestfulController {
    static responseFormats = ['json', 'xml']

    TodoController() {
        super(Todo)
    }

    def search(String query) {
        if (query) {
            def searchQuery = Todo.where {
                title =~ "%${query}%"
            }
            respond searchQuery.list()
        } else {
            respond([])
        }
    }
}
