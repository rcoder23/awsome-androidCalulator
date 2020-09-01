package fritprfojects.example.mynotes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import net.objecthunter.exp4j.ExpressionBuilder
import kotlin.collections.List as List1

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var Res: String = ""
        btnone.setOnClickListener {

            Res += "1"
            result.text = Res
        }
        btntwo.setOnClickListener {

            Res += "2"
            result.text = Res
        }

        btnthree.setOnClickListener {
            Res += "3"
            result.text = Res
        }
        btnfour.setOnClickListener {
            Res += "4"
            result.text = Res
        }
        btnfive.setOnClickListener {
            Res += "5"
            result.text = Res
        }
        btnsix.setOnClickListener {
            Res += "6"
            result.text = Res
        }
        btnseven.setOnClickListener {
            Res += "7"
            result.text = Res
        }
        btneight.setOnClickListener {
            Res += "8"
            result.text = Res
        }
        btnnine.setOnClickListener {
            Res += "9"
            result.text = Res
        }
        btnzero.setOnClickListener {
            Res += "0"
            result.text = Res
        }
        btnplus.setOnClickListener {
            Res += "+"
            result.text = Res
        }
        btnminus.setOnClickListener {
            Res += "-"
            result.text = Res
        }
        btnmul.setOnClickListener {
            Res += "*"
            result.text = Res
        }
        btndiv.setOnClickListener {
            Res += "/"
            result.text = Res
        }
        btnequal.setOnClickListener {
         try {

            val expression = ExpressionBuilder(Res).build()
            val result2 = expression.evaluate()
             val longResult = result2.toLong()

//             if(result2==longResult.toDouble()){
//                 result.text=longResult.toString()
//             }
//             else{
//                 result.text=result2.toDouble()
//             }
             Res = result2.toString()
             result.text = result2.toString()
         }
         catch(e:Exception){
            Log.i("Exception","message")
         }


        }
    }
}