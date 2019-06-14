plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-android-extensions")
}

android {
    compileSdkVersion(Deps.compileSdk)
    buildToolsVersion(Deps.buildTools)
    defaultConfig {
        applicationId = "com.samelody.samples.dep"
        minSdkVersion(Deps.minSdk)
        targetSdkVersion(Deps.targetSdk)
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "android.support.test.runner.AndroidJUnitRunner"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }
    }
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    implementation(Deps.kotlinStdlib)
    implementation(Deps.kotlinReflect)
    implementation(Deps.annotation)
    implementation(Deps.core)
    implementation(Deps.coreKtx)
    implementation(Deps.cameraCore)
    implementation(Deps.cameraCamera2)
    implementation(Deps.customView)
    implementation(Deps.activity)
    implementation(Deps.activityKtx)
    implementation(Deps.biometric)
    implementation(Deps.browser)
    implementation(Deps.dataBinding)
    implementation(Deps.dataBindingAdapters)
    implementation(Deps.dynamicAnimation)
    implementation(Deps.dynamicAnimationKtx)
    implementation(Deps.flexbox)
    implementation(Deps.enterpriseFeedback)
    implementation(Deps.fragment)
    implementation(Deps.fragmentKtx)
    implementation(Deps.loader)
    implementation(Deps.listenableFuture)
    implementation(Deps.listenableFutureCallback)
    implementation(Deps.preference)
    implementation(Deps.preferenceKtx)
    implementation(Deps.viewModelKtx)
    implementation(Deps.viewModelSavedState)
    implementation(Deps.liveDataKtx)
    implementation(Deps.recyclerView)
    implementation(Deps.recyclerViewSelection)
    implementation(Deps.lifecycle)
    implementation(Deps.lifecycleReactiveStreams)
    implementation(Deps.appCompat)
    implementation(Deps.appCompatResources)
    implementation(Deps.room)
    implementation(Deps.roomKtx)
    implementation(Deps.roomCoroutines)
    implementation(Deps.roomMigration)
    implementation(Deps.sqlite)
    implementation(Deps.sqliteKtx)
    implementation(Deps.shareTarget)
    implementation(Deps.securityCrypto)
    implementation(Deps.versionedParcelable)
    implementation(Deps.paging)
    implementation(Deps.pagingKtx)
    implementation(Deps.pagingRxJava)
    implementation(Deps.pagingRxJavaKtx)
    implementation(Deps.heifWriter)
    implementation(Deps.palette)
    implementation(Deps.paletteKtx)
    implementation(Deps.recommendation)
    implementation(Deps.material)
    implementation(Deps.coroutinesAndroid)
    implementation(Deps.kotlinxIoJvm)
    implementation(Deps.atomicfu)
    implementation(Deps.media)
    implementation(Deps.mediaWidget)
    implementation(Deps.media2Common)
    implementation(Deps.media2Session)
    implementation(Deps.media2Player)
    implementation(Deps.mediaRouter)
    implementation(Deps.exifInterface)
    implementation(Deps.contentPager)
    implementation(Deps.slice)
    implementation(Deps.sliceView)
    implementation(Deps.sliceBuilders)
    implementation(Deps.multidex)
    implementation(Deps.savedState)
    implementation(Deps.navigation)
    implementation(Deps.navigationUi)
    implementation(Deps.navigationFragment)
    implementation(Deps.collection)
    implementation(Deps.collectionKtx)
    implementation(Deps.constraintLayout)
    implementation(Deps.swipeRefreshLayout)
    implementation(Deps.slidingPaneLayout)
    implementation(Deps.drawerLayout)
    implementation(Deps.gridLayout)
    implementation(Deps.cardView)
    implementation(Deps.transition)
    implementation(Deps.textClassifier)
    implementation(Deps.viewPager)
    implementation(Deps.viewPager2)
    implementation(Deps.biometric)
    implementation(Deps.car)
    implementation(Deps.wear)
    implementation(Deps.work)
    implementation(Deps.workKtx)
    implementation(Deps.workRxJava)
    implementation(Deps.webkit)
    implementation(Deps.leanback)
    implementation(Deps.leanbackPreference)
    implementation(Deps.localBroadcastManager)
    implementation(Deps.tvProvider)
    implementation(Deps.vectorDrawable)
    implementation(Deps.vectorDrawableAnimated)
    implementation(Deps.interpolator)
    implementation(Deps.ktor_client_core)
    implementation(Deps.ktor_client_core_jvm)
    implementation(Deps.ktor_client_android)
    implementation(Deps.ktor_client_okhttp)
    implementation(Deps.ktor_client_ios)
    implementation(Deps.ktor_client_json)
    implementation(Deps.ktor_client_gson)
    implementation(Deps.okHttp)
    implementation(Deps.okio)
    implementation(Deps.glide)
    implementation(Deps.exoPlayer)
    implementation(Deps.exoPlayerRtmp)
    implementation(Deps.retrofit)
    implementation(Deps.gson)
    implementation(Deps.coordinatorLayout)
    implementation(Deps.simpleCropView)
    implementation(Deps.remoteCallback)
    implementation(Deps.eventBus)
    implementation(Deps.gifEncoder)
    implementation(Deps.arCore)
//    implementation(Deps.sceneformCore)
//    implementation(Deps.sceneformUx)
    implementation(Deps.eiffel)
    implementation(Deps.easyPermissions)
    implementation(Deps.leakCanary)
    implementation(Deps.lottie)
//    implementation(Deps.guava)

    testImplementation(Deps.benchmark)
    testImplementation(Deps.workTesting)
    testImplementation(Deps.testCore)
    testImplementation(Deps.testMonitor)
    testImplementation(Deps.testRunner)
    testImplementation(Deps.testRules)
    testImplementation(Deps.espresso)
    testImplementation(Deps.junit)
    testImplementation(Deps.coroutinesTest)
    testImplementation(Deps.coroutinesDebug)
}
