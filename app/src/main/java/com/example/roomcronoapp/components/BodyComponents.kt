package com.example.roomcronoapp.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.roomcronoapp.R
import com.example.roomcronoapp.ui.theme.darkTheme
import com.example.roomcronoapp.ui.theme.darkThemeClaro
import com.example.roomcronoapp.ui.theme.glittergold


@Composable
fun MainTitle(title: String) {
    Text(text = title, color = glittergold, fontWeight = FontWeight.Bold)
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainTextField(value: String, onValueChange: (String) -> Unit, label: String) {
    OutlinedTextField(
        value = value,
        colors = TextFieldDefaults.textFieldColors(textColor = glittergold,
            containerColor = darkThemeClaro, cursorColor = glittergold,
            focusedIndicatorColor = glittergold, focusedLabelColor = glittergold,
            focusedLeadingIconColor = glittergold, unfocusedLeadingIconColor = glittergold,
            unfocusedIndicatorColor = glittergold, unfocusedLabelColor = glittergold,
            unfocusedSupportingTextColor = glittergold, unfocusedTrailingIconColor = glittergold),
        onValueChange = onValueChange,
        label = { Text(text = label) },
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 30.dp)
            .padding(bottom = 15.dp)
    )
}

@Composable
fun formatTiempo(tiempo: Long): String {
    val segundos = (tiempo / 1000) % 60
    val minutos = (tiempo / 1000 / 60) % 60
    val horas = tiempo / 1000 / 3600
    return String.format("%02d:%02d:%02d", horas, minutos, segundos)
}

@Composable
fun CronCard(titulo: String, crono: String, onClick: () -> Unit) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onClick() }
            .background(darkTheme)
    ) {
        Column(
            modifier = Modifier
                .padding(15.dp)
                .background(darkTheme)
        ) {
            Text(
                text = titulo,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = glittergold
            )

            Row {
                Icon(
                    painter = painterResource(R.drawable.time),
                    contentDescription = "",
                    tint = glittergold
                )
                Text(text = crono, fontSize = 20.sp, color = glittergold)
            }
            Divider(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(1.dp),
                color = glittergold
            )

        }
    }
}












