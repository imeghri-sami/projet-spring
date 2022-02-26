import {
  Button,
  Dialog,
  DialogActions,
  DialogContent,
  Typography,
} from "@mui/material";
import { grey } from "@mui/material/colors";

function ConfirmDialogActions({ onDiscardClick, onCancelClick }) {
  return (
    <DialogActions sx={{ flexDirection: "column", alignItems: "center" }}>
      <Button
        onClick={onDiscardClick}
        variant="text"
        color="error"
        sx={{ width: "100%" }}
      >
        Discard
      </Button>
      <Button
        onClick={onCancelClick}
        variant="text"
        sx={{ color: grey[600], width: "100%" }}
      >
        Cancel
      </Button>
    </DialogActions>
  );
}

export default function ConfirmDialog({ open, setOpen, onDiscardClick }) {
  //const [isOpen, setIsOpen] = useState(open);

  function handleCancelClick() {
    setOpen(false);
    //setIsOpen(false);
  }

  return (
    <Dialog open={open}>
      <DialogContent sx={{ padding: "35px" }}>
        <Typography
          align="center"
          sx={{ fontWeight: "bold" }}
          variant="h6"
          gutterBottom
          component="div"
        >
          Discard post?
        </Typography>
        <Typography>If you leave, your edits won't be saved.</Typography>
      </DialogContent>
      <ConfirmDialogActions
        onCancelClick={handleCancelClick}
        onDiscardClick={() => {
          onDiscardClick();
          setOpen(false);
        }}
      />
    </Dialog>
  );
}
