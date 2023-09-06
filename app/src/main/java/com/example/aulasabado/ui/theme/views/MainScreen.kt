package com.example.aulasabado.ui.theme.views

import android.annotation.SuppressLint
import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TaskScreen() {

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun TaskScreen2(){
        var vlrDoTextField = remember {
            mutableStateOf("ValorInicial")
        }

        val cuteBlue = Color(0xFF90CAF9)

        Scaffold(
            topBar = {
                TopAppBar(
                    title = {

                        Text(
                            text = "Jetpack Compose State",
                            style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 20.sp),
                            color = Color.Black
                        )
                    },
                    colors = TopAppBarDefaults.smallTopAppBarColors(cuteBlue),
                    navigationIcon =     { Icon(Icons.Default.Star, contentDescription = "Voltar", tint = Color.Black, modifier = Modifier.padding(20.dp))}
                )
            },
            bottomBar = {
                BottomAppBar(
                    containerColor = cuteBlue,
                    contentColor = Color.Black // Cor do conteúdo da bottom app bar
                ) {
                       Text(
                        text = "Ana Beatriz Martins Batista - RM: 22284",
                        style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 15.sp),
                        color = Color.Black,
                           modifier = Modifier.padding(20.dp)
                      )
                }
            }
        ) {

            Column(modifier = Modifier
                .padding(all = 20.dp)
                .fillMaxWidth()) {
                Spacer(modifier = Modifier.height(100.dp))
                Row(){
                    Text(
                        text = "Atualizando o Text",
                        style = TextStyle(
                            fontWeight = FontWeight.Bold,
                            fontSize = 24.sp,
                            color = cuteBlue,
                            textAlign = TextAlign.Center,
                        ),
                        modifier = Modifier.fillMaxWidth()
                    )

                }
                Spacer(modifier = Modifier.height(20.dp))
                OutlinedTextField(
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        focusedBorderColor = cuteBlue,
                        unfocusedBorderColor = Color.White,
                        focusedLabelColor = Color.White,
                        cursorColor = cuteBlue,
                        textColor = cuteBlue),
                    value = vlrDoTextField.value,
                    onValueChange =  {// Antes da tela ser redesenhada, roda esse trecho de código aqui:
                    vlrDoTextField.value = it
                            Log.i("### fun taskScreen(){....", it) },
                    label = { Text("Digite Aqui", color = Color.White) },

                    keyboardOptions = KeyboardOptions(imeAction = ImeAction.Next),
                    modifier = Modifier.fillMaxWidth()
                )
                Spacer(modifier = Modifier.height(20.dp))
                Text(vlrDoTextField.value,         style = TextStyle(
                    fontWeight = FontWeight.Bold,
                    fontSize = 24.sp,
                    color = cuteBlue,
                    textAlign = TextAlign.Center,
                ),
                    modifier = Modifier.fillMaxWidth())
                Spacer(modifier = Modifier.height(20.dp))


            }
        }

    }


    TaskScreen2()
}