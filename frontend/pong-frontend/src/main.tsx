import ReactDOM from "react-dom/client";
import App from "./App.tsx";

ReactDOM.createRoot(document.querySelector("#root") as HTMLElement).render(
  <div className="bg-dark">
    <App />
  </div>
);
