package com.hencoder.layoutsize.view

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatImageView
import kotlin.math.min

class SquareImageView(context: Context?, attrs: AttributeSet?) : AppCompatImageView(context, attrs) {

  private val paint = Paint(Paint.ANTI_ALIAS_FLAG)

  override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
    super.onMeasure(widthMeasureSpec, heightMeasureSpec)

    val size = min(measuredWidth, measuredHeight)

    setMeasuredDimension(size, size)
  }

  override fun onDraw(canvas: Canvas) {
    super.onDraw(canvas)
//    canvas.drawBitmap(,0,0, paint)
  }
}