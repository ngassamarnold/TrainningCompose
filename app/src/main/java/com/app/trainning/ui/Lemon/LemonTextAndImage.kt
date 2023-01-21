import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.app.trainning.dto.Lemon

@Composable
fun LemonTextAndImage(
    lemon:Lemon,
    onImageClick: ()->Unit,
    modifier: Modifier = Modifier
){
    Column(
        modifier=modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text=lemon.title,
            fontSize = 18.sp,
            modifier = Modifier.padding(16.dp)
        )
        Image(
            painter = painterResource(lemon.image),
            contentDescription = null,
            modifier = Modifier
                .border(2.dp,
                    color = Color(105, 205, 216), shape = RoundedCornerShape(5))
                .padding(15.dp)
                .clickable { onImageClick() }
        )
    }
}