import { player } from "../types/Player";
const Player = (props: player) => {
  return (
    <tr>
      <td>{props.name}</td>
      <td>{String(props.highScore)}</td>
    </tr>
  );
};

export default Player;
