import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun CardText(tile:String,description:String,color:Color, modifier: Modifier = Modifier){
    Column(
        modifier= modifier
            .fillMaxSize()
            .background(color)
        //.wrapContentWidth(Alignment.CenterHorizontally)
        //  .wrapContentHeight(Alignment.CenterVertically)
    ) {
        Column( modifier= modifier
            .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center) {
            Text(
                text =tile,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(bottom = 16.dp),
            )
            Text(
                text =description,
                textAlign = TextAlign.Justify
            )
        }
    }
}
