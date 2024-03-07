package xyz.teamgravity.customshapedemo

import androidx.compose.ui.geometry.RoundRect
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp

class SpeechBubbleShape(
    private val radius: Dp = 15.dp,
    private val tipSize: Dp = 15.dp
) : Shape {

    override fun createOutline(size: Size, layoutDirection: LayoutDirection, density: Density): Outline {
        val radius = with(density) { radius.toPx() }
        val tipSize = with(density) { tipSize.toPx() }

        val path = Path()
        path.addRoundRect(
            RoundRect(
                left = tipSize,
                top = 0F,
                right = size.width,
                bottom = size.height - tipSize,
                radiusX = radius,
                radiusY = radius
            )
        )
        path.moveTo(
            x = tipSize,
            y = size.height - tipSize - radius
        )
        path.lineTo(
            x = 0F,
            y = size.height
        )
        path.lineTo(
            x = tipSize + radius,
            y = size.height - tipSize
        )
        path.close()

        return Outline.Generic(path)
    }
}