import './Hero.css';
import Carousel from 'react-material-ui-carousel';
import { Paper } from '@mui/material';
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome';
import { faCirclePlay } from '@fortawesome/free-solid-svg-icons';
import {Link, useNavigate} from "react-router-dom";
import Button from 'react-bootstrap/Button';


const Hero = ({games}) => {

    const navigate = useNavigate();

    function reviews(gameId)
    {
        navigate(`/Reviews/${gameId}`);
    }

  return (
    <div className ='game-carousel-container'>
      <Carousel>
        {
            games?.map((game) =>{
                return(
                    <Paper key={game.imdbId}>
                        <div className = 'game-card-container'>
                            <div className="game-card">
                                <div className="game-detail">
                                    <div className="game-poster">
                                        <img src={game.poster} alt="" />
                                    </div>
                                    <div className="game-title">
                                        <h4>{game.title}</h4>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </Paper>
                )
            })
        }
      </Carousel>
    </div>
  )
}

export default Hero