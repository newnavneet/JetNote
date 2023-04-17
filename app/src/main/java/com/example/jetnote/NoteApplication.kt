package com.example.jetnote

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

// its going to extend android application as such
@HiltAndroidApp
class NoteApplication : Application() {}
