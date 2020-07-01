package kr.co.tjoeun.kotlinbasic_20200701

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        touchBtn.setOnClickListener {

//            touchBtn이 눌리면 실행될 코드를 적는 {  }

//            Toast를 이용해 사용자에게 안내 메시지.
            Toast.makeText(this, "터치 버튼을 눌렀습니다.", Toast.LENGTH_SHORT).show()

            Log.d("메인화면", "터치버튼 눌림")

            Log.e("메인화면", "에러 로그 찍어보기")


        }

        secondBtn.setOnClickListener {

            Toast.makeText(this, "둘째 버튼 눌림", Toast.LENGTH_SHORT).show()

            Log.d("메인화면", "둘째 버튼 눌림")


        }

//        토스트띄우기 버튼이 눌리면
        showToastBtn.setOnClickListener {

//            EditText에  입력된 내용을 받자. (String으로 저장해두자)
//            대입값이 String이면 => 변수 타입도 자동으로 String으로 결정됨.
            val inputContent = inputContentEdt.text.toString()

//            inputContent를 Toast로 출력
            Toast.makeText(this,inputContent,Toast.LENGTH_SHORT).show()

//            상수(val)과 변수(var)의 차이
//            val input:String
//            input="테스트"
//            input="테스트2" <수정 안됨. 에러. 오류.
//           var input2:String
//            input2="입력테스트"
//            input2="입력테스트2"

//            10은 정수. 정수를 num1에 대입 => num1은 Int로 결정.
//            val num1 = 10
        }

        ageBtn.setOnClickListener {
//            입력한 나이를 Int로 저장하자.
            val inputAge = ageEdt.text.toString().toInt()
//            나이가 60살 이상이면 어르신입ㄴ디ㅏ 출력
            if ( inputAge >=60){
                Toast.makeText(this,"어르신입니다",Toast.LENGTH_SHORT).show()
            }
//            입력된 나이값에 따라 다른 처리 when
            when(inputAge){
                in 10..19 -> Toast.makeText(this,"미성년입니다",Toast.LENGTH_SHORT).show()
                20 -> {Toast.makeText(this,"스무살이다.",Toast.LENGTH_SHORT).show()}
                27,27 ->{Toast.makeText(this,"스무살이다.",Toast.LENGTH_SHORT).show()}
                30 -> {Toast.makeText(this,"나랑 동갑이다.",Toast.LENGTH_SHORT).show()}
                else -> {Toast.makeText(this,"아무 해당사항 없는 나이",Toast.LENGTH_SHORT).show()}
            }


        }

    }
}