## 🍽️ BiteFlix
BiteFlix is a modern Android recipe app built with Jetpack Compose, powered by TheMealDB API, and spiced with Retrofit, ViewModel, and Coil. It fetches and displays a list of meal categories with images in a sleek, grid-based UI. Users can tap on any category to view more details — including an image and description — on a dedicated screen.
## Features
- 📦 Jetpack Compose UI — clean, declarative UI with Material3

- 🌐 API Integration — fetches meal categories from TheMealDB

- 📷 Image Loading — smooth thumbnail rendering with Coil

- 🔁 MVVM Architecture — organized logic using ViewModel

- 🚀 Coroutines for asynchronous data fetching

- 👆 Interactive UI — Tap on a category to explore its description on a separate screen


## Tech Stack
| Layer           | Tech                          |
|----------------|-------------------------------|
| Language        | Kotlin                        |
| UI              | Jetpack Compose, Material 3   |
| Networking      | Retrofit + Gson               |
| Image Loading   | Coil                          |
| Architecture    | MVVM with `ViewModel`         |
| Async Handling  | Kotlin Coroutines             |
| State Mgmt      | `State` + `mutableStateOf`    |
| Navigation      | Navigation Compose            |
| Data Passing    | `Parcelable` + `SavedStateHandle` |

## Preview
![Screenshot_20250608_230321](https://github.com/user-attachments/assets/676d102c-d9a9-49c3-80a5-6a68c714db21)

## API Used
- TheMealDB: Free public API for meals and recipes
- Endpoint used: `https://www.themealdb.com/api/json/v1/1/categories.php`

## Acknowledgements
- TheMealDB for the API
- Jetpack Compose
- Coil
- Retrofit

