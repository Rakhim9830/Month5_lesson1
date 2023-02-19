package com.rahim.lesson1_month5

class Presenter{
    val model = Model()
    lateinit var view: View

    fun increment(){
        model.increment()
        view.showCount(model.count)
        if (model.count == 10){
            view.toast(message = "поздравляю")
        }
        if(model.count == 15) {
            view.color(model.count)
        }
        else {
            view.defaultColor(model.count)
        }

    }
    fun decrement(){
        model.decrement()
        view.showCount(model.count)
        if (model.count == 10){
            view.toast(message = "поздравляю")
        }
       if (model.count == 15){
            view.color(model.count)
        }
        else{
       view.defaultColor(model.count)
        }

    }
    fun fillCounterView(view: View){
        this.view = view
    }


}