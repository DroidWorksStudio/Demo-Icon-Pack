package com.github.droidworksstudio.icons.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.github.droidworksstudio.icons.R
import com.github.droidworksstudio.icons.ui.theme.LetterIconPackTheme

@Composable
fun WhyDemoIconPack(viewModel: MainViewModel = MainViewModel()) {
    LazyColumn(
        modifier = Modifier
            .fillMaxWidth(),
        contentPadding = PaddingValues(horizontal = 20.dp)
    ) {
        item {
            Spacer(modifier = Modifier.height(20.dp))
        }
        items(items = viewModel.appFeatures) { feature ->
            Features(title = feature.feature, desc = feature.desc)
        }

    }
}

@Composable
private fun Features(title: String, desc: String) {
    Text(
        text = title,
        color = MaterialTheme.colorScheme.onSecondary,
        fontFamily = FontFamily(Font(R.font.inter)),
        modifier = Modifier
            .background(
                color = MaterialTheme.colorScheme.secondary,
                shape = RoundedCornerShape(30.dp)
            )
            .padding(PaddingValues(10.dp))
    )
    Spacer(modifier = Modifier.height(20.dp))
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(10.dp),
    ) {
        Box(
            modifier = Modifier
                .padding(top = 5.dp)
                .size(10.dp)
                .background(
                    color = MaterialTheme.colorScheme.onSurface,
                    shape = CircleShape
                )
        )
        Text(
            text = desc,
            fontFamily = FontFamily(Font(R.font.inter)),
        )
    }
    Spacer(modifier = Modifier.height(20.dp))
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DescriptionPreview() {
    LetterIconPackTheme {
        WhyDemoIconPack()
    }
}