package io.priyank.grails

import org.grails.datastore.gorm.GormEntity

class Todo implements  GormEntity<Todo>{

    String title;
    String description
    boolean done

    static constraints = {
        title blank: false
        description blank: false
        title size: 10..124
        description size: 20..1024
    }
}
