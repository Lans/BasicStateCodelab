package com.example.basicstatecodelab.water

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun WaterCounter(modifier: Modifier = Modifier) {
    Column(modifier.padding(16.dp)) {
        // val count: MutableState<Int> = remember { mutableStateOf(0) }
        //我们也可以使用 Kotlin 的委托属性来简化 count 的使用。
        //var count by remember { mutableStateOf(0) }
        //rememberSaveable 会自动保存可保存在 Bundle 中的任何值
//        var count by rememberSaveable { mutableStateOf(0) }

//        if (count > 0) {
//            Text(
//                text = "你喝了${count} 杯水",
//            )
//        }
//        Row(modifier.padding(start = 8.dp)) {
//            Button(
//                onClick = { count++ }, enabled = count < 10
//            ) {
//                Text(text = "喝一杯")
//            }
//            Button(onClick = { count = 0 }, modifier = modifier.padding(start = 8.dp)) {
//                Text(text = "清空")
//            }
//        }

//        if (count > 0) {
//            var showTask by remember {
//                mutableStateOf(true)
//            }
//            if (showTask) {
//                WellnessTaskItem(
//                    taskName = "今天走15分钟了吗?",
//                    onClose = { showTask = false })
//            }
//            Text(
//                text = "你喝了${count} 杯水",
//            )
//        }
//
//        Row(modifier.padding(start = 8.dp)) {
//            Button(
//                onClick = { count++ }, enabled = count < 10
//            ) {
//                Text(text = "喝一杯")
//            }
//            Button(onClick = { count = 0 }, modifier = modifier.padding(start = 8.dp)) {
//                Text(text = "清空")
//            }
//        }
    }
}

//定义无状态ui
@Composable
fun StatelessCounter(count: Int, onIncrement: () -> Unit, modifier: Modifier = Modifier) {
    Column(modifier.padding(16.dp)) {
        if (count > 0) {
            Text(
                text = "你喝了${count} 杯水",
            )
        }
        Row(modifier.padding(start = 8.dp)) {
            Button(
                onClick = onIncrement, enabled = count < 10
            ) {
                Text(text = "喝一杯")
            }
        }
    }
}

//定义 状态值变化驱动
@Composable
fun StatefulCounter(modifier: Modifier = Modifier) {
    var count by rememberSaveable { mutableStateOf(0) }
    var juiceCount by rememberSaveable { mutableStateOf(0) }
    Column{
        StatelessCounter(count = count, onIncrement = { count++ }, modifier)
//        StatelessCounter(count = juiceCount, onIncrement = { juiceCount++ }, modifier)
    }
}