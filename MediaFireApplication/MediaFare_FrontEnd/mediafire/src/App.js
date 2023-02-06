import { BrowserRouter, Route, Routes } from "react-router-dom";
import Home from "./pages/Home";
import PlanUpgrade from "./pages/PlanUpgrade";
import "../node_modules/bootstrap/dist/css/bootstrap.min.css";

function App() {
  return (
    <div className="App">
      <BrowserRouter>
        <Routes>
          <Route path="/" element={<Home />} />
          <Route path="/home" element={<Home />} />
          <Route path="/upgrade" element={<PlanUpgrade />} />
        </Routes>
      </BrowserRouter>
    </div>
  );
}

export default App;
