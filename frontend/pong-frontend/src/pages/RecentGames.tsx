import RecentGamesTable from "../components/RecentGamesTable";
import useFetch from "../hooks/useFetch";

const RecentGames = () => {
  const data = useFetch("http://localhost:8080/api/v1/games/recent");
  return data && <RecentGamesTable players={data} />;
};

export default RecentGames;
