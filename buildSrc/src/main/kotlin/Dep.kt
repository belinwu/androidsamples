@Suppress("MemberVisibilityCanBePrivate")
object Dep {
    // Common
    const val javaVersion = "1.8"

    // Android
    const val androidGradleVersion = "4.2.0-alpha15"
    const val compileSdkVersion = 30
    const val targetSdkVersion = 30
    const val minSdkVersion = 21
    const val buildToolsVersion = "30.0.2"
    const val activityVersion = "1.2.0-beta01"
    const val appCompatVersion = "1.3.0-alpha02"
    const val workVersion = "2.5.0-beta01"
    const val navigationVersion = "2.3.1"
    const val pagingVersion = "3.0.0-alpha08"
    const val roomVersion = "2.3.0-alpha03"
    const val lifecycleVersion = "2.3.0-beta01"
    const val adsIdVersion = "1.0.0-alpha04"
    const val listenableFutureVersion = "1.0.0-beta01"
    const val coreVersion = "1.5.0-alpha04"
    const val fragmentVersion = "1.3.0-beta01"
    const val media2Version = "1.1.0-rc01"
    const val sqliteVersion = "2.1.0"
    const val windowVersion = "1.0.0-alpha01"
    const val cameraVersion = "1.0.0-beta10"
    const val cameraViewVersion = "1.0.0-alpha18"
    const val emojiVersion = "1.2.0-alpha01"
    const val exoPlayerVersion = "2.12.0"
    const val dataStoreVersion = "1.0.0-alpha02"
    const val dataBindingVersion = "4.2.0-alpha07"
    const val composeVersion = "1.0.0-alpha06"
    const val composeCompilerVersion = "1.4.0"
    const val hiltVersion = "1.0.0-alpha02"
    const val testVersion = "1.3.0"
    const val leanbackVersion = "1.1.0-alpha05"

    // Kotlin
    const val kotlinVersion = "1.4.10"
    const val coroutinesVersion = "1.4.0-M1"
    const val serializationVersion = "1.0.0"
    const val ktorVersion = "1.4.0"
    const val exposedVersion = "0.24.1"

    // Others
    const val frescoVersion = "2.3.0"
    const val coilVersion = "1.0.0"
    const val workflowVersion = "1.0.0-alpha.3"

    // Android Jetpack
    const val activity = "androidx.activity:activity-ktx:$activityVersion"
    const val adsId = "androidx.ads:ads-identifier:$adsIdVersion"
    const val adsIdProvider = "androidx.ads:ads-identifier-provider:1.0.0-alpha02"
    const val annotation = "androidx.annotation:annotation:1.2.0-alpha01"
    const val annotationExperimental = "androidx.annotation:annotation-experimental:1.1.0-alpha01"
    const val appCompat = "androidx.appcompat:appcompat:$appCompatVersion"
    const val appCompatResources = "androidx.appcompat:appcompat-resources:$appCompatVersion"
    const val autoFill = "androidx.autofill:autofill:1.1.0-alpha02"
    const val benchmark = "androidx.benchmark:benchmark-common:1.1.0-alpha01"
    const val biometric = "androidx.biometric:biometric:1.1.0-beta01"
    const val browser = "androidx.browser:browser:1.3.0-beta01"
    const val cameraCamera2 = "androidx.camera:camera-camera2:$cameraVersion"
    const val cameraCore = "androidx.camera:camera-core:$cameraVersion"
    const val cameraExtensions = "androidx.camera:camera-extensions:$cameraViewVersion"
    const val cameraLifecycle = "androidx.camera:camera-lifecycle:$cameraVersion"
    const val cameraView = "androidx.camera:camera-view:$cameraViewVersion"
    const val car = "androidx.car:car:1.0.0-alpha7"
    const val cardView = "androidx.cardview:cardview:1.0.0"
    const val collection = "androidx.collection:collection-ktx:1.1.0"
    const val composeAnimation = "androidx.compose.animation:animation:$composeVersion"
    const val composeCompiler = "androidx.compose.compiler:compiler:$composeVersion"
    const val composeDispatch = "androidx.compose.runtime:runtime-dispatch:$composeVersion"
    const val composeFoundation = "androidx.compose.foundation:foundation:$composeVersion"
    const val composeFoundationLayout = "androidx.compose.foundation:foundation-layout:$composeVersion"
    const val composeFoundationText = "androidx.compose.foundation:foundation-text:$composeVersion"
    const val composeGeometry = "androidx.compose.ui:ui-geometry:$composeVersion"
    const val composeGraphics = "androidx.compose.ui:ui-graphics:$composeVersion"
    const val composeLiveData = "androidx.compose.runtime:runtime-livedata:$composeVersion"
    const val composeMaterial = "androidx.compose.material:material:$composeVersion"
    const val composeMaterialIconsExtended = "androidx.compose.material:material-icons-extended:$composeVersion"
    const val composeSavedState = "androidx.compose.runtime:runtime-saved-instance-state:$composeVersion"
    const val composeTest = "androidx.ui:ui-test:$composeVersion"
    const val composeText = "androidx.compose.ui:ui-text:$composeVersion"
    const val composeTextAndroid = "androidx.compose.ui:ui-text-android:$composeVersion"
    const val composeTooling = "androidx.ui:ui-tooling:$composeVersion"
    const val composeUi = "androidx.compose.ui:ui:$composeVersion"
    const val composeUnit = "androidx.compose.ui:ui-unit:$composeVersion"
    const val composeUtil = "androidx.compose.ui:ui-util:$composeVersion"
    const val composeViewBinding = "androidx.compose.ui:ui-viewbinding:$composeVersion"
    const val concurrentFutures = "androidx.concurrent:concurrent-futures-ktx:1.1.0"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:2.0.0"
    const val contentPager = "androidx.contentpager:contentpager:1.0.0"
    const val coordinatorLayout = "androidx.coordinatorlayout:coordinatorlayout:1.1.0"
    const val core = "androidx.core:core-ktx:$coreVersion"
    const val coreAnimation = "androidx.core:core-animation:1.0.0-alpha02"
    const val coreRole = "androidx.core:core-role:1.1.0-alpha01"
    const val customView = "androidx.customview:customview:1.1.0"
    const val dataBinding = "androidx.databinding:databinding-runtime:$dataBindingVersion"
    const val dataBindingAdapters = "androidx.databinding:databinding-adapters:$dataBindingVersion"
    const val dataStorePreferences = "androidx.datastore:datastore-preferences:$dataStoreVersion"
    const val drawerLayout = "androidx.drawerlayout:drawerlayout:1.1.1"
    const val dynamicAnimation = "androidx.dynamicanimation:dynamicanimation-ktx:1.0.0-alpha03"
    const val emoji = "androidx.emoji:emoji:$emojiVersion"
    const val emojiAppCompat = "androidx.emoji:emoji-appcompat:$emojiVersion"
    const val emojiBundled = "androidx.emoji:emoji-bundled:$emojiVersion"
    const val enterpriseFeedback = "androidx.enterprise:enterprise-feedback:1.0.0-alpha02"
    const val espressoCore = "androidx.test.espresso:espresso-core:3.3.0"
    const val exifInterface = "androidx.exifinterface:exifinterface:1.3.0"
    const val fragment = "androidx.fragment:fragment-ktx:$fragmentVersion"
    const val fragmentTesting = "androidx.fragment:fragment-testing:$fragmentVersion"
    const val gamesFramePacing = "androidx.games:games-frame-pacing:1.7.0-alpha01"
    const val gamesPerformanceTuner = "androidx.games:games-performance-tuner:1.1.0-alpha01"
    const val gridLayout = "androidx.gridlayout:gridlayout:1.0.0"
    const val heifWriter = "androidx.heifwriter:heifwriter:1.0.0"
    const val hilt = "androidx.hilt:hilt-common:$hiltVersion"
    const val hiltViewModel = "androidx.hilt:hilt-lifecycle-viewmodel:$hiltVersion"
    const val hiltWork = "androidx.hilt:hilt-work:$hiltVersion"
    const val interpolator = "androidx.interpolator:interpolator:1.0.0"
    const val leanback = "androidx.leanback:leanback:$leanbackVersion"
    const val leanbackPaging = "androidx.leanback:leanback-paging:$leanbackVersion"
    const val leanbackPreference = "androidx.leanback:leanback-preference:$leanbackVersion"
    const val leanbackTab = "androidx.leanback:leanback-tab:$leanbackVersion"
    const val lifecycle = "androidx.lifecycle:lifecycle-runtime-ktx:$lifecycleVersion"
    const val lifecycleCommon = "androidx.lifecycle:lifecycle-common:$lifecycleVersion"
    const val lifecycleCompiler = "androidx.lifecycle:lifecycle-compiler:$lifecycleVersion"
    const val lifecycleJava8 = "androidx.lifecycle:lifecycle-common-java8:$lifecycleVersion"
    const val lifecycleProcess = "androidx.lifecycle:lifecycle-process:$lifecycleVersion"
    const val lifecycleService = "androidx.lifecycle:lifecycle-service:$lifecycleVersion"
    const val listenableFuture = "androidx.concurrent:concurrent-listenablefuture:$listenableFutureVersion"
    const val listenableFutureCallback = "androidx.concurrent:concurrent-listenablefuture-callback:$listenableFutureVersion"
    const val liveData = "androidx.lifecycle:lifecycle-livedata:$lifecycleVersion"
    const val liveDataKtx = "androidx.lifecycle:lifecycle-livedata-ktx:$lifecycleVersion"
    const val loader = "androidx.loader:loader:1.1.0"
    const val localBroadcastManager = "androidx.localbroadcastmanager:localbroadcastmanager:1.0.0"
    const val media = "androidx.media:media:1.2.0"
    const val media2Common = "androidx.media2:media2-common:$media2Version"
    const val media2ExoPlayer = "androidx.media2:media2-exoplayer:$media2Version"
    const val media2Player = "androidx.media2:media2-player:$media2Version"
    const val media2Session = "androidx.media2:media2-session:$media2Version"
    const val media2Widget = "androidx.media2:media2-widget:$media2Version"
    const val mediaRouter = "androidx.mediarouter:mediarouter:1.2.0-rc02"
    const val multiDex = "androidx.multidex:multidex:2.0.1"
    const val navigation = "androidx.navigation:navigation-runtime-ktx:$navigationVersion"
    const val navigationFragment = "androidx.navigation:navigation-fragment-ktx:$navigationVersion"
    const val navigationUi = "androidx.navigation:navigation-ui-ktx:$navigationVersion"
    const val navigationCompose = "android.navigation:navigation-compose:1.0.0-alpha01"
    const val paging = "androidx.paging:paging-runtime-ktx:$pagingVersion"
    const val pagingCompose = "androidx.paging:paging-compose:1.0.0-alpha01"
    const val palette = "androidx.palette:palette-ktx:1.0.0"
    const val preference = "androidx.preference:preference-ktx:1.1.1"
    const val recommendation = "androidx.recommendation:recommendation:1.0.0"
    const val recyclerView = "androidx.recyclerview:recyclerview:1.2.0-alpha06"
    const val recyclerViewSelection = "androidx.recyclerview:recyclerview-selection:1.1.0-rc03"
    const val remoteCallback = "androidx.remotecallback:remotecallback:1.0.0-alpha02"
    const val remoteCallbackProcessor = "androidx.remotecallback:remotecallback-processor:1.0.0-alpha02"
    const val room = "androidx.room:room-ktx:$roomVersion"
    const val roomCompiler = "androidx.room:room-compiler:$roomVersion"
    const val roomMigration = "androidx.room:room-migration:$roomVersion"
    const val savedState = "androidx.savedstate:savedstate-ktx:1.1.0-beta01"
    const val securityCrypto = "androidx.security:security-crypto:1.0.0-rc02"
    const val securityIdentity = "androidx.security:security-identity-credential:1.0.0-alpha01"
    const val shareTarget = "androidx.sharetarget:sharetarget:1.1.0-beta01"
    const val slice = "androidx.slice:slice-core:1.0.0"
    const val sliceBuilders = "androidx.slice:slice-builders:1.0.0"
    const val sliceView = "androidx.slice:slice-view:1.0.0"
    const val slidingPaneLayout = "androidx.slidingpanelayout:slidingpanelayout:1.1.0"
    const val sqlite = "androidx.sqlite:sqlite-ktx:$sqliteVersion"
    const val startup = "androidx.startup:startup-runtime:1.0.0"
    const val swipeRefreshLayout = "androidx.swiperefreshlayout:swiperefreshlayout:1.2.0-alpha01"
    const val testCore = "androidx.test:core:$testVersion"
    const val testCoreKtx = "androidx.test:core-ktx:$testVersion"
    const val testJunit = "androidx.test.ext:junit:1.1.1"
    const val testMonitor = "androidx.test:monitor:$testVersion"
    const val testOrchestrator = "androidx.test:orchestrator:$testVersion"
    const val testRules = "androidx.test:rules:$testVersion"
    const val testRunner = "androidx.test:runner:$testVersion"
    const val testUiAutomator = "androidx.test.uiautomator:uiautomator:2.2.0"
    const val textClassifier = "androidx.textclassifier:textclassifier:1.0.0-alpha02"
    const val tracing = "androidx.tracing:tracing-ktx:1.0.0"
    const val transition = "androidx.transition:transition:1.4.0-beta01"
    const val tvProvider = "androidx.tvprovider:tvprovider:1.1.0-alpha01"
    const val vectorDrawable = "androidx.vectordrawable:vectordrawable:1.2.0-alpha02"
    const val vectorDrawableAnimated = "androidx.vectordrawable:vectordrawable-animated:1.1.0"
    const val vectorDrawableSeekable = "androidx.vectordrawable:vectordrawable-seekable:1.0.0-alpha02"
    const val versionedParcelable = "androidx.versionedparcelable:versionedparcelable:1.1.0"
    const val viewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycleVersion"
    const val viewModelSavedState = "androidx.lifecycle:lifecycle-viewmodel-savedstate:$lifecycleVersion"
    const val viewPager = "androidx.viewpager:viewpager:1.0.0"
    const val viewPager2 = "androidx.viewpager2:viewpager2:1.1.0-alpha01"
    const val wear = "androidx.wear:wear:1.0.0"
    const val webkit = "androidx.webkit:webkit:1.4.0-alpha01"
    const val window = "androidx.window:window:$windowVersion"
    const val windowExtensions = "androidx.window:window-extensions:$windowVersion"
    const val work = "androidx.work:work-runtime-ktx:$workVersion"
    const val workMultiProcess = "androidx.work:work-multiprocess:$workVersion"
    const val workTesting = "androidx.work:work-testing:$workVersion"

    // Google
    const val material = "com.google.android.material:material:1.3.0-alpha03"
    const val materialComposeTheme = "com.google.android.material:compose-theme-adapter:1.0.0-alpha01"
    const val ksp = "com.google.devtools.ksp:symbol-processing-api:1.4.10-dev-experimental-20201009"
    const val flexbox = "com.google.android:flexbox:2.0.1"
    const val arCore = "com.google.ar:core:1.11.0"
    const val sceneformCore = "com.google.ar.sceneform:core:1.11.0"
    const val sceneformUx = "com.google.ar.sceneform.ux:sceneform-ux:1.9.0"
    const val kotlinStdlib = "org.jetbrains.kotlin:kotlin-stdlib:$kotlinVersion"
    const val kotlinStdlibJdk8 = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:$kotlinVersion"
    const val kotlinReflect = "org.jetbrains.kotlin:kotlin-reflect:$kotlinVersion"
    const val kotlinScripting = "org.jetbrains.kotlin:kotlin-scripting-jvm:$kotlinVersion"
    const val kotlinCompiler = "org.jetbrains.kotlin:kotlin-compiler:$kotlinVersion"
    const val coroutinesCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$coroutinesVersion"
    const val coroutinesAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:$coroutinesVersion"
    const val coroutinesSwing = "org.jetbrains.kotlinx:kotlinx-coroutines-swing:$coroutinesVersion"
    const val coroutinesTest = "org.jetbrains.kotlinx:kotlinx-coroutines-test:$coroutinesVersion"
    const val coroutinesDebug = "org.jetbrains.kotlinx:kotlinx-coroutines-debug:$coroutinesVersion"
    const val kotlinAtomicFu = "org.jetbrains.kotlinx:atomicfu:0.14.4"
    const val kotlinMetadataJvm = "org.jetbrains.kotlinx:kotlinx-metadata-jvm:0.0.4"
    const val kotlinImmutableCollections = "org.jetbrains.kotlinx:kotlinx-collections-immutable-jvm:0.3.3"
    const val kotlinIo = "org.jetbrains.kotlinx:kotlinx-io-jvm:0.1.16"
    const val kotlinDateTime = "org.jetbrains.kotlinx:kotlinx-datetime:0.1.0"
    const val kotlinSerializationCore = "org.jetbrains.kotlinx:kotlinx-serialization-core:$serializationVersion"
    const val kotlinSerializationJson = "org.jetbrains.kotlinx:kotlinx-serialization-json:$serializationVersion"
    const val kotlinSerializationProtoBuf = "org.jetbrains.kotlinx:kotlinx-serialization-protobuf:$serializationVersion"
    const val kotlinHtml = "org.jetbrains.kotlinx:kotlinx-html-jvm:0.7.2"
    const val exposedCore = "org.jetbrains.exposed:exposed-core:$exposedVersion"
    const val exposedDao = "org.jetbrains.exposed:exposed-dao:$exposedVersion"
    const val exposedJdbc = "org.jetbrains.exposed:exposed-jdbc:$exposedVersion"
    const val exposedTime = "org.jetbrains.exposed:exposed-java-time:$exposedVersion"
    const val skija = "org.jetbrains.skija:skija:0.0.0"
    const val skiko = "org.jetbrains.skiko:skiko-jvm:0.1.5"
    const val leakCanary = "com.squareup.leakcanary:leakcanary-android:2.5"
    const val okhttp = "com.squareup.okhttp3:okhttp:4.9.0"
    const val okio = "com.squareup.okio:okio:2.9.0"
    const val wire = "com.squareup.wire:wire-runtime:3.2.2"
    const val gson = "com.google.code.gson:gson:2.8.6"
    const val retrofit = "com.squareup.retrofit2:retrofit:2.9.0"
    const val moshi = "com.squareup.moshi:moshi:1.9.3"
    const val javaPoet = "com.squareup:javapoet:1.13.0"
    const val kotlinPoet = "com.squareup:kotlinpoet:1.6.0"
    const val glide = "com.github.bumptech.glide:glide:4.11.0"
    const val glideCompiler = "com.github.bumptech.glide:compiler:4.11.0"
    const val photoView = "com.github.chrisbanes:PhotoView:2.3.0"
    const val timber = "com.jakewharton.timber:timber:4.7.1"
    const val junit = "junit:junit:4.13"
    const val protoBuffer = "com.google.protobuf:protobuf-javalite:3.10.0"
    const val firebaseStorage = "com.google.firebase:firebase-storage:17.0.0"
    const val zxing = "com.google.zxing:android-core:3.3.0"
    const val simpleCropView = "com.isseiaoki:simplecropview:1.1.8"
    const val commonsText = "org.apache.commons:commons-text:1.4"
    const val commonsLang = "org.apache.commons:commons-lang3:3.8"
    const val commonsIo = "org.apache.commons:commons-io:1.3.2"
    const val commonsCollections = "org.apache.commons:commons-collections4:4.2"
    const val commonsCsv = "org.apache.commons:commons-csv:1.6"
    const val commonsCompress = "org.apache.commons:commons-compress:1.18"
    const val exoPlayer = "com.google.android.exoplayer:exoplayer:$exoPlayerVersion"
    const val exoPlayerRtmp = "com.google.android.exoplayer:extension-rtmp:$exoPlayerVersion"
    const val arrowCore = "io.arrow-kt:arrow-core:0.11.0"
    const val lottie = "com.airbnb.android:lottie:3.4.2"
    const val truth = "com.google.truth:truth:0.42"
    const val ktorClientCore = "io.ktor:ktor-client-core:$ktorVersion"
    const val ktorClientCoreJvm = "io.ktor:ktor-client-core-jvm:$ktorVersion"
    const val ktorClientAndroid = "io.ktor:ktor-client-android:$ktorVersion"
    const val ktorClientOkHttp = "io.ktor:ktor-client-okhttp:$ktorVersion"
    const val ktorClientIos = "io.ktor:ktor-client-ios:$ktorVersion"
    const val ktorClientJson = "io.ktor:ktor-client-json:$ktorVersion"
    const val ktorClientGson = "io.ktor:ktor-client-gson:$ktorVersion"
    const val jsoup = "org.jsoup:jsoup:1.11.3"
    const val mmkv = "com.tencent:mmkv:1.2.2"
    const val wcdb = "com.tencent.wcdb:wcdb-android:1.0.8"
    const val statusBarCompat = "com.githang:status-bar-compat:0.7"
    const val kotlinCli = "org.jetbrains.kotlinx:cli:0.1"
    const val multiplatform_settings_common = "com.russhwolf:multiplatform-settings-common:0.1"
    const val multiplatform_settings_android = "com.russhwolf:multiplatform-settings-android:0.1"
    const val multiplatform_settings_ios = "com.russhwolf:multiplatform-settings-ios:0.1"
    const val blurkit = "io.alterac.blurkit:blurkit:1.0.0"
    const val subsamplingImageView = "com.davemorrissey.labs:subsampling-scale-image-view:3.10.0"
    const val fresco = "com.facebook.fresco:fresco:$frescoVersion"
    const val frescoGif = "com.facebook.fresco:animated-gif:$frescoVersion"
    const val frescoAnimated = "com.facebook.fresco:animated-base:$frescoVersion"
    const val frescoWebp = "com.facebook.fresco:animated-webp:$frescoVersion"
    const val eventBus = "org.greenrobot:eventbus:3.2.0"
    const val gifEncoder = "com.squareup:gifencoder:0.9.1"
    const val eiffel = "com.github.etiennelenhart:eiffel:4.1.0"
    const val easyPermissions = "pub.devrel:easypermissions:3.0.0"
    const val workflowAndroid = "com.squareup.workflow1:workflow-ui-core-android:$workflowVersion"
    const val workflowCompose = "com.squareup.workflow:workflow-ui-core-compose:0.30.0"
    const val workflowModal = "com.squareup.workflow1:workflow-ui-modal-android:$workflowVersion"
    const val workflowBackStack = "com.squareup.workflow1:workflow-ui-backstack-android:$workflowVersion"
    const val halCore = "com.github.adrielcafe.hal:hal-core:0.0.2"
    const val halCoreLiveData = "com.github.adrielcafe.hal:hal-livedata:0.0.2"
    const val coil = "io.coil-kt:coil:$coilVersion"
    const val coilGif = "io.coil-kt:coil-gif:$coilVersion"
    const val coilSvg = "io.coil-kt:coil-svg:$coilVersion"
    const val coilVideo = "io.coil-kt:coil-video:$coilVersion"
    const val accompanistCoil = "dev.chrisbanes.accompanist:accompanist-coil:0.2.0"
    const val imageViewTouch = "it.sephiroth.android.library.imagezoom:imagezoom:2.3.0"
    const val materialDialogsCore = "com.afollestad.material-dialogs:core:3.3.0"
    const val materialDialogsDateTime = "com.afollestad.material-dialogs:datetime:3.3.0"
    const val qmui = "com.qmuiteam:qmui:2.0.0-alpha10"
    const val qmuiArch = "com.qmuiteam:arch:2.0.0-alpha10"
    const val materialDrawer = "com.mikepenz:materialdrawer:7.0.0"
    const val spyglass = "com.linkedin.android.spyglass:spyglass:2.1.0"
    const val liTr = "com.linkedin.android.litr:litr:1.2.4"
    const val tachyon = "com.linkedin.android.tachyon:tachyon:1.0.2"
    const val jsonCpp = "com.android.ndk.thirdparty:jsoncpp:1.8.4-alpha-1"
    const val poi = "org.apache.poi:poi:4.1.2"
    const val thirtyInch = "net.grandcentrix.thirtyinch:thirtyinch:1.0.1"
    const val tray = "net.grandcentrix.tray:tray:0.12.0"
    const val compressor = "id.zelory:compressor:3.0.0"
    const val drawableDsl = "com.github.infotech-group:android-drawable-dsl:0.3.0"
    const val spotlight = "com.github.takusemba:spotlight:2.0.1"
    const val hikari = "com.zaxxer:HikariCP:3.4.5"
    const val kxml = "net.sf.kxml:kxml2:2.3.0"
    const val asm = "org.ow2.asm:asm-commons:9.0"
}