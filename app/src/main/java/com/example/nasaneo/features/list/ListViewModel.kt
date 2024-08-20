package com.example.nasaneo.features.list

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.nasaneo.di.AppModule.IO_SCHEDULER
import com.example.nasaneo.di.AppModule.UI_SCHEDULER
import io.reactivex.Scheduler
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Inject
import javax.inject.Named

class ListViewModel @Inject constructor(
    // feel free to inject required dependencies here
    @Named(IO_SCHEDULER) ioScheduler: Scheduler,
    @Named(UI_SCHEDULER) uiScheduler: Scheduler
) : ViewModel() {

    private val compositeDisposable = CompositeDisposable()

    val viewState = MutableLiveData<ListViewState>()

    init {
        // put your code fetching data here
    }

    fun onItemClicked(itemState: ListItemState) {
        // handle 'on click' logic here
    }

    override fun onCleared() {
        super.onCleared()
        compositeDisposable.clear()
    }
}
