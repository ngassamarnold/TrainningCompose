import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.app.trainning.ui.theme.Teal201

@Composable
fun CardBusiness(name:String, position:String, picture: Painter, phone:String, share:String, email:String, modifier: Modifier = Modifier){
    Column(
        modifier= modifier
            .background(Teal201)
            .fillMaxWidth()
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier= modifier
                .weight(4f)
                .fillMaxWidth()
        ) {
            Image(
                painter = picture,
                contentDescription = null,
                modifier= modifier
                    .width(120.dp)
                    .height(120.dp)
            )
            Text(
                text = name,
                fontSize = 30.sp,
                modifier=modifier.padding(12.dp),
                color = Color.White
            )
            Text(
                text = position,
                color = Color.Green,
                fontWeight = FontWeight.Bold
            )
        }
        Column(
            modifier= modifier
                .fillMaxWidth()
                .weight(1f)
        ) {
            Divider(
                color = Color.Gray,
                thickness = 1.dp,
            )
            Row(
                modifier = modifier
                    .padding(8.dp)
            ) {
                Icon(
                    imageVector = Icons.Default.Phone,
                    contentDescription =null,
                    tint = Color.Green,
                    modifier=modifier
                        .padding(start = 50.dp, end = 15.dp)
                )
                Text(
                    text = phone,
                    color = Color.White
                )
            }
            Divider(
                color = Color.Gray,
                thickness = 1.dp,
            )
            Row(
                modifier = modifier
                    .padding(8.dp)
            ) {
                Icon(
                    imageVector = Icons.Default.Share,
                    contentDescription =null,
                    tint = Color.Green,
                    modifier=modifier
                        .padding(start = 50.dp, end = 15.dp)
                )
                Text(
                    text = share,
                    color = Color.White
                )
            }
            Divider(
                color = Color.Gray,
                thickness = 1.dp,
            )
            Row(
                modifier = modifier
                    .padding(8.dp)
            ) {
                Icon(
                    imageVector = Icons.Default.Email,
                    contentDescription =null,
                    tint = Color.Green,
                    modifier=modifier
                        .padding(start = 50.dp, end = 15.dp)
                )
                Text(
                    text = email,
                    color = Color.White
                )
            }
        }
    }
}
