import {useState} from "react";
import axios from "axios";

const Game = () => {
  const [username, setUsername] = useState("");
  const [player, setPlayer] = useState(null);

  const handleCreatePlayer = async () => {
    const response = await axios.post(`/api/players/create?username=${username}`);
    setPlayer(response.data);
  };

  return (
    <div>
      <h1>Bienvenue dans Dactylo Fighter Z</h1>
      <input
        type="text"
        value={username}
        onChange={(e) => setUsername(e.target.value)}
        placeholder="Entrez votre pseudo"
      />
      <button onClick={handleCreatePlayer}>Créer un joueur</button>
      {player && <p>Joueur créé : {player.username}</p>}
    </div>
  );
};

export default Game;
