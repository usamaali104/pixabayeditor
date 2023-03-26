package com.bytee.beyondapps.presentation.ui.activity.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bytee.beyondapps.presentation.ui.activity.ui.theme.Light200
import com.bytee.beyondapps.presentation.ui.activity.ui.theme.Purple700
import com.bytee.beyondapps.presentation.ui.activity.ui.theme.Teal200

@Composable
fun EditImageTopContent(
    hasFilteredImage: Boolean = false,
    modifier: Modifier,
    onSave: () -> Unit,
    onBack: () -> Unit,
    showNavigationIcon: Boolean = true,
    showActionIcon: Boolean = true,
    title: String = "Apply filter"
) {
    var isBack by remember { mutableStateOf(false) }
    TopAppBar(
        title = {
            Text(
                text = title,
                color = Color.White,
                fontSize = 18.sp
            )
        },
        modifier = modifier,
        navigationIcon = {
            if (showNavigationIcon) {
                IconButton(
                    onClick = {
                        onBack()
                    }
                ) {
                    Icon(
                        Icons.Default.ArrowBack,
                        contentDescription = "back icon",
                        tint = Light200,
                        modifier = Modifier.padding(start = 12.dp)
                    )
                }
            }

        },
        actions = {
            if (showActionIcon) {
                if (hasFilteredImage) {
                    IconButton(
                        onClick = { onSave.invoke() }
                    ) {
                        Text(
                            text = "Save",
                            color = Color.White,
                            fontSize = 16.sp
                        )
                    }
                }
            }

        },
        backgroundColor = Purple700,
        elevation = 4.dp
    )

}