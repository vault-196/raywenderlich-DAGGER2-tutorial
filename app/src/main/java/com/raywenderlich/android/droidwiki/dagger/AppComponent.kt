package com.raywenderlich.android.droidwiki.dagger

import com.raywenderlich.android.droidwiki.ui.homepage.HomepageActivity
import com.raywenderlich.android.droidwiki.ui.search.SearchActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class, PresenterModule::class, WikiModule::class, NetworkModule::class])
interface AppComponent {

    fun inject(target: HomepageActivity)

    fun inject(target: SearchActivity)
}
