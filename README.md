##Requirement 
1. Show trending repos of github in a
   RecyclerView using Github APIs
2. On click of Item, THE ROW SHOULD BE
   SELECTED
3. Orientation Vertical & Horizontal both
   should be allowed.
4. Position and Item Selection should be
   maintain on Orientation Change
5. Needful Android app Architecture to be
   followed(to be chosen by you as per your
   preference)
6. I Can Search the repo from the local list
   using a search box on top which will
   filter the list
7. Maintain Selection after search as well
8. All relevant Error states to be handled in
   the app

- [HomePage](https://github.com/fatehsinghsaini/GithubTrendingList/blob/master/device-2021-12-11-234522.png)
- [DetailPage](https://github.com/fatehsinghsaini/GithubTrendingList/blob/master/device-2021-12-11-234544.png)
- [SearchPage](https://github.com/fatehsinghsaini/GithubTrendingList/blob/master/device-2021-12-11-234611.png)

## API
Since there is no official API for Trending Repositories (it is one of the internal GitHub API’s),
<br />
I have decided to use [GitHub Search API](https://developer.github.com/v3/search/#search-repositories) and sort the repositories by their stars.

## Tech stack
- Minimum SDK level 23
- [Kotlin](https://kotlinlang.org/) based for asynchronous.
- Dagger-Hilt (alpha) for dependency injection.
- JetPack
  - LiveData - notify domain layer data to views.
  - Lifecycle - dispose of observing data when lifecycle state changes.
  - ViewModel - UI related data holder, lifecycle aware.
  - Navigation Component - handle everything needed for in-app navigation.
  - Data Binding - declaratively bind observable data to UI elements.
- Architecture
  - MVVM Architecture (View - DataBinding - ViewModel - Model)
  - Repository pattern
- [Glide](https://github.com/bumptech/glide) - loading images.
- [CircleImageView](https://github.com/hdodenhof/CircleImageView)-for circle image view   
- [Retrofit2 & OkHttp3](https://github.com/square/retrofit) - construct the REST APIs and paging network data.
- [Material-Components](https://github.com/material-components/material-components-android) - Material design components like ripple animation, cardView.


