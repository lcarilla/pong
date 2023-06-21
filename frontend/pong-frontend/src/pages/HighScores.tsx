import HighScoreTable from "../components/HighScoreTable";
import useFetch from "../hooks/useFetch";

const HighScores = () => {
  const data = useFetch("http://localhost:8080/api/v1/games/");
  return data && <HighScoreTable players={data} />;
};

export default HighScores;
