import Player from "./Player";
import { player } from "../types/Player";
interface HighScoreTableProps {
  players: player[];
}
const HighScoreTable = (props: HighScoreTableProps) => {
  return (
    <>
      <h1 className="display-4 text-white">High Score</h1>
      <table className="table table-dark">
        <thead>
          <tr>
            <th scope="col">Name</th>
            <th scope="col">Highscore</th>
          </tr>
        </thead>
        <tbody>
          {props.players.map((p) => {
            return (
              <Player name={p.name} highScore={p.highScore} id={p.id}></Player>
            );
          })}
        </tbody>
      </table>
    </>
  );
};

export default HighScoreTable;
