package chapter4.Button1

import java.io.Serializable

interface State : Serializable

interface View {
    fun getCurrentState() : State
    fun restoreState(state : State) {}
}


class Button : View {
    override fun getCurrentState() : State = ButtonState()

    override fun restoreState(state: State) { /*...*/ }

    class ButtonState : State { /*...*/ }           // This class is an analogous of a static nested class in Java
}