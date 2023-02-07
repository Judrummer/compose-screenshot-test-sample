package com.github.judrummer.composescreenshottestsample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.airbnb.android.showkase.ui.ShowkaseBrowserActivity
import com.github.judrummer.common.theme.AppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {

                    Column() {
                        Button(onClick = {
                            startActivity(
                                ShowkaseBrowserActivity.getIntent(
                                    this@MainActivity,
                                    AppShowkaseModule::class.qualifiedName.toString(),
                                )
                            )
                        }) {
                            Text(text = "Open Showkase")
                        }
                    }

                }
            }
        }
    }
}
