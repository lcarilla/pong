import Player from "./Player";
import { games } from "../types/Game";
interface HighScoreTableProps {
  players: games[];
}
const HighScoreTable = (props: HighScoreTableProps) => {
  return (
    <>
      <h1 className="display-4 text-white">Recent Games</h1>
      <table className="table table-dark">
        <thead>
          <tr>
            <th scope="col">Name</th>
            <th scope="col">Score</th>
          </tr>
        </thead>
        <tbody>
          {props.players.map((p) => {
            return (
              <Player name={p.name} highScore={p.score} id={p.id}></Player>
            );
          })}
        </tbody>
      </table>
    </>
  );
};

export default HighScoreTable;
