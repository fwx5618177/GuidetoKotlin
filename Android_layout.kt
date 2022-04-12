verticalLayout {
    val name  = editText()

    button("Say hi") {
        onClick { toast("Hell") }
    }
}