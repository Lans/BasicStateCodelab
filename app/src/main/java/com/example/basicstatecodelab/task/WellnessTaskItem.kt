package com.example.basicstatecodelab.task

import androidx.compose.foundation.layout.Row
import androidx.compose.material.Checkbox
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun WellnessTaskItem(
    taskName: String,
    checked: Boolean,
    onCheckedChangeListener: (Boolean) -> Unit,
    onClose: () -> Unit,
    modifier: Modifier = Modifier
) {
    Row(modifier = modifier, verticalAlignment = Alignment.CenterVertically) {
        Text(
            text = taskName, modifier = modifier
                .weight(1f)
        )
        Checkbox(
            checked = checked,
            onCheckedChange = onCheckedChangeListener
        )
        IconButton(onClick = onClose) {
            Icon(imageVector = Icons.Filled.Close, contentDescription = "close")
        }
    }
}

//@Composable
//fun WellnessTaskItem(
//    taskName: String,
//    modifier: Modifier = Modifier,
//    onClose: () -> Unit,
//) {
//    var checkedState by rememberSaveable {
//        mutableStateOf(false)
//    }
//    WellnessTaskItem(
//        taskName,
//        checkedState,
//        onCheckedChangeListener = { newValue -> checkedState = newValue },
//        onClose = onClose,
//        modifier = modifier
//    )
//}