package com.example.quizapp

object Constants {

    const val  User_Name :String = "user_name"
    const val TOTAL_QUESTION :String = "total_question"
    const val CORRECT_ANSWER :String = "correct_answer"

    fun getQuestion(): ArrayList<Question> {
        val questionList = ArrayList<Question>()

        val que1 = Question(
            1, "What Country Flag belong to?", R.drawable.india,
            "Indian", "Pakistan", "China", "Bangladesh", 1
        )
        questionList.add(que1)

        val que2 = Question(
            1, "What Country Flag belong to?", R.drawable.pakistan,
            "sri Lanka", "Pakistan", "Nepal", "New zealand", 2
        )
        questionList.add(que2)

        val que3 = Question(
            1, "What Country Flag belong to?", R.drawable.bangladesh,
            "Brazil", "Cyprus", "Egypt", "Bangladesh", 4
        )
        questionList.add(que3)

        val que4 = Question(
            1, "What Country Flag belong to?", R.drawable.srilanka,
            "Sri Lanka", "Israel", "Kenya", "Jordan", 1
        )
        questionList.add(que4)

        val que5 = Question(
            1, "What Country Flag belong to?", R.drawable.nepal,
            "America", "Mexico", "Cuba", "Nepal", 4
        )
        questionList.add(que5)

        val que6 = Question(
            1, "What Country Flag belong to?", R.drawable.newzeeland,
            "South Africa", "Australia ", "New zealand", "Bangladesh", 3
        )
        questionList.add(que6)

        val que7 = Question(
            1, "What Country Flag belong to?", R.drawable.niger,
            "West Indies", "Niger", "Afghanistan", "Poland", 2
        )
        questionList.add(que7)

        val que8 = Question(
            1, "What Country Flag belong to?", R.drawable.afghan,
            "Afghan", "Russia ", "Libya", "Bangladesh", 1
        )
        questionList.add(que8)

        val que9 = Question(
            1, "What Country Flag belong to?", R.drawable.england,
            "Indian", "Pakistan", "China", "England", 4
        )
        questionList.add(que9)

        val que10 = Question(
            1, "What Country Flag belong to?", R.drawable.japan,
            "Mongolia", "Singapore", "Japan", "Bangladesh", 3
        )
        questionList.add(que10)

        return questionList
    }
}