package com.example.thorium

import android.graphics.Color
import com.google.android.gms.maps.model.LatLng

object Constants {

    const val CAMERA_INITIAL_ZOOM = 15f

    const val CIRCLE_RADIUS = 20.0

    const val CIRCLE_STROKE_WIDTH = 0.0F

    const val LOCATION_UPDATE_FASTEST_INTERVAL = 1000L // milliseconds

    const val LOCATION_UPDATE_SMALLEST_DISPLACEMENT = 10.0f // meters

    val INITIAL_LOCATION = LatLng(35.6892, 51.3890) // tehran

    val INITIAL_LOCATION2 = LatLng(32.6581, 51.7084) // isfahan

    const val COLOR_2G = Color.BLUE

    const val COLOR_3G = Color.GREEN

    const val COLOR_4G = Color.RED
}