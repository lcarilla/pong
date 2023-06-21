import { BrowserRouter, Route, Routes } from "react-router-dom";
import Navbar from "./components/Navbar";
import "bootstrap/dist/css/bootstrap.min.css";
import HighScores from "./pages/HighScores";
import "bootstrap/dist/js/bootstrap.min.js";
import RecentGames from "./pages/RecentGames";
import HomePage from "./pages/HomePage";
import "./App.css";
function App() {
  return (
    <BrowserRouter>
      <Navbar />
      <Routes>
        <Route path="/" element={<HomePage />} />
        <Route path="/highscores" element={<HighScores />} />
        <Route path="/recentgames" element={<RecentGames />} />
      </Routes>
    </BrowserRouter>
  );
}

export default App;
